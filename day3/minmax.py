def find_max_min(items):
  if min(items)==max(items):
    return[len(items)]
  return [min(items),max(items)]